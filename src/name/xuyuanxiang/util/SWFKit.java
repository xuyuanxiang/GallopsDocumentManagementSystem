package name.xuyuanxiang.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.hibernate.action.spi.Executable;

public class SWFKit {

	// 要转换的pdf文件路径
	private static String INPUT_PATH;
	// 转换后的swf文件路径
	private static String OUTPUT_PATH;

	private static String SWF_BASE = "C:/SWFTools/";
	private static String PDF2SWF_PATH = SWF_BASE + "pdf2swf.exe";
	private static String PNG2SWF_PATH = SWF_BASE + "png2swf.exe";
	private static String JPEG2SWF_PATH = SWF_BASE + "jpeg2swf.exe";
	private static String GIF2SWF_PATH = SWF_BASE + "gif2swf.exe";

	/**
	 * PDF/JPEG/GIF/PNG转SWF
	 * 
	 * @param pdffile
	 *            PDF文件全路径
	 * @param swffile
	 *            转换后SWF文件存放路径
	 */
	public static String toSwf(File pdffile, File swffile) {
		INPUT_PATH = pdffile.getPath();
		OUTPUT_PATH = swffile.getPath();
		if ("pdf".equals(checkContentType(INPUT_PATH))) {
			return toSwf(PDF2SWF_PATH);
		} else if ("png".equals(checkContentType(INPUT_PATH))) {
			return toSwf(PNG2SWF_PATH);
		} else if ("jpeg".equals(checkContentType(INPUT_PATH))) {
			return toSwf(JPEG2SWF_PATH);
		} else if ("gif".equals(checkContentType(INPUT_PATH))) {
			return toSwf(GIF2SWF_PATH);
		} else {
			return null;
		}
	}

	/**
	 * 检查文件是否是pdf类型的
	 * 
	 * @return
	 */
	public static String checkContentType(String filePath) {
		return filePath.substring(filePath.lastIndexOf(".") + 1,
				filePath.length()).toLowerCase();
	}

	/**
	 * 调用批处理文件生成swf文件
	 */
	private static String toSwf(String command) {
		File pdf = new File(INPUT_PATH);
		if (pdf.isFile()) {
			try {
				Runtime r = Runtime.getRuntime();
				Process process =  r.exec(command + " " + INPUT_PATH + " -o " + OUTPUT_PATH
						+ " -T 9");
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String line = null;
				StringBuffer buffer = new StringBuffer();
				while((line = reader.readLine()) != null){
					buffer.append(line);
					System.out.println(line);
				}
				int result = process.waitFor();
				System.out.println(result);
				return buffer.toString();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

}