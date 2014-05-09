package name.xuyuanxiang.util;

import java.io.File;

public class DocConverter {

	public static String allToSwf(File file, File swfFile) {
		String filePath = file.getPath();
		String suffix = "." + SWFKit.checkContentType(filePath);
		if (".pdf".equals(suffix) || ".png".equals(suffix)
				|| ".gif".equals(suffix) || ".jpg".equals(suffix))
			return SWFKit.toSwf(file, swfFile);
		if (".doc".equals(suffix) || ".xls".equals(suffix)
				|| ".ppt".equals(suffix)) {
			File pdfFile = new File(file.getPath().replace(suffix, "") + ".pdf");
			if (!pdfFile.isFile()) {
				Office2PDFKit.office2PDF(file, pdfFile.getPath());
			}
			return SWFKit.toSwf(pdfFile, swfFile);
		}
		return null;
	}
}
