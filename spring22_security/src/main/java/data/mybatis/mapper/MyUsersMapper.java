package data.mybatis.mapper;

import com.jhta.spring22.security.CustomUserDetail;
import com.jhta.spring22.vo.MyAuthoritiesVo;
import com.jhta.spring22.vo.MyUsersVo;

public interface MyUsersMapper {
	CustomUserDetail getAuths(String userid);
	int addUser(MyUsersVo vo);
	int addAuth(MyAuthoritiesVo vo);
}
