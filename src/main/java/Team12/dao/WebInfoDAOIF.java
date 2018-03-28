package Team12.dao;
import java.util.List;

import Team12.model.WebInfo;
public interface WebInfoDAOIF {
	WebInfo findByid(int id);
	List<WebInfo> findAllWebpages();
	void save(WebInfo webInfo);
	void deleteById(int id);
}
