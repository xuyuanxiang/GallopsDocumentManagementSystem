package name.xuyuanxiang.util;

import java.io.File;
import java.io.IOException;
import java.net.ConnectException;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

public class Office2PDFKit {

	public static int office2PDF(File inputFile, String destFile) {
		try {
			if (!inputFile.exists())
				return -1;// 找不到源文件, 则返回-1

			// 如果目标路径不存在, 则新建该路径
			File outputFile = new File(destFile);
			if (!outputFile.getParentFile().exists()) {
				outputFile.getParentFile().mkdirs();
			}

			// OpenOffice的安装目录,
//			String OpenOffice_HOME = "C:\\Program Files (x86)\\OpenOffice 4";

			// 如果从文件中读取的URL地址最后一个字符不是 '\'，则添加'\'
//			if (OpenOffice_HOME.charAt(OpenOffice_HOME.length() - 1) != '\\')
//				OpenOffice_HOME += "\\";

			// 启动OpenOffice的服务
//			String command = OpenOffice_HOME
////					+ "program\\soffice.exe -headless -accept=\"socket,host=127.0.0.1,port=8100;urp;\"";
//			Process pro = Runtime.getRuntime().exec(command);

			// 连接到服务端口
			OpenOfficeConnection connection = new SocketOpenOfficeConnection(
					"127.0.0.1", 8100);
			connection.connect();

			// 开始转换
			DocumentConverter converter = new OpenOfficeDocumentConverter(
					connection);
			converter.convert(inputFile, outputFile);

			// 关闭连接
			connection.disconnect();

			// 关闭OpenOffice服务的进程
//			pro.destroy();

			return 0;
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 1;
	}

}
