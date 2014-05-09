package name.xuyuanxiang.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * 分页 封装类
 * @author Yuanxiang
 *
 * @param <T>
 */
public class Page<T> implements Serializable {
	private static final long serialVersionUID = 6580866643281259330L;

	private int pageSize = Constants.defaultPageSize;
	private int pageNo = 1;
	private long rowCount = 0;
	private int totalPage = 0;

	private List<T> list = new ArrayList<T>();

	public Page(int pageNo, int pageSize, long rowCount, List<T> list) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.rowCount = rowCount;
		this.list = list;
		double size = (double) this.pageSize == 0 ? Constants.defaultPageSize
				: this.pageSize;
		double count = (double) rowCount;
		this.totalPage = (int) Math.ceil(count / size);
	}

	public void next() {
		this.pageNo++;
	}

	public void prev() {
		this.pageNo--;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public long getRowCount() {
		return rowCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
