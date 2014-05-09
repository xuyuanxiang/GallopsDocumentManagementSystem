package name.xuyuanxiang.util;

import java.io.File;

public class DocumentKit {

	public static String mkdir(String filePath) {
		File file = new File(filePath);
		file.mkdir();
		return file.getAbsolutePath();
	}

	public static File get(String filePath) {
		return new File(filePath);
	}

	public static boolean delete(String filePath) {
		File file = new File(filePath);
		return file.delete();
	}

}
