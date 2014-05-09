package name.xuyuanxiang.common;

import java.io.File;

/**
 * 系统常量
 * 
 * @author Yuanxiang
 * 
 */
public class Constants {

	public static final String DOMAIN = "云南腾俊投资集团";
	public static final String DOMAIN_ID = "11e1-ae18-d04ada40-a3b2-4960a74ab202";

	public static final int defaultPageSize = 15;

	public static final String PREVIEW = new File(Constants.class
			.getResource("")
			.getPath()
			.substring(
					0,
					Constants.class.getResource("").getPath()
							.lastIndexOf("WEB-INF"))
			+ "preview/").getPath()
			+ "\\";

	public static final String TEMP = new File(Constants.class
			.getResource("")
			.getPath()
			.substring(
					0,
					Constants.class.getResource("").getPath()
							.lastIndexOf("WEB-INF"))
			+ "tmp/").getPath()
			+ "\\";

}
