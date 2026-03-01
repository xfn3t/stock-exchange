package user;

/**
 * Сервис для работы с пользователями: регистрация, аутентификация,
 * управление профилем.
 */
public class UserService {
	/**
	 * Регистрирует нового пользователя.
	 * TODO: добавить проверку уникальности email, хеширование пароля.
	 *
	 * @param email    электронная почта
	 * @param password пароль
	 * @return true, если регистрация успешна
	 */
	public boolean register(String email, String password) {
		System.out.println("Registering user: " + email);
		return true;
	}
}