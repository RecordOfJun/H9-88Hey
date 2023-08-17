package softeer.h9.hey.auth.repository;

import java.util.Optional;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import softeer.h9.hey.auth.domain.User;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public User save(User user) {
		String sql = "INSERT INTO `user`(user_id, password, created_at) "
			+ "values (:userId, :password, NOW())";

		SqlParameterSource param = new MapSqlParameterSource()
			.addValue("userId", user.getUserId())
			.addValue("password", user.getPassword());

		KeyHolder keyHolder = new GeneratedKeyHolder();
		namedParameterJdbcTemplate.update(sql, param, keyHolder);
		Integer userId = keyHolder.getKey().intValue();

		user.setId(userId);
		return user;
	}

	@Override
	public Optional<User> findByUserId(String userId) {
		return null;
	}
}
