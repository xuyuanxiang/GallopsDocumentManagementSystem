package name.xuyuanxiang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.model.Operation;

@Transactional
public class OperationManager extends BaseManager<Operation, String> {

	public OperationManager() {
		super(Operation.class);
	}

	public Operation getByName(String name) {
		String hql = "from Operation where name = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(name);
		return operationDao.getFirstResult(hql, parameters);
	}
}
