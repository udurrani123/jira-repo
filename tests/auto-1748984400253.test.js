Sure! Below is the Jest test code for the hypothetical `src/user_registration_login.js` module. The tests will cover various scenarios including happy paths, error cases, and mocking.




// src/user_registration_login.js
class UserRegistrationLogin {
  constructor(database) {
    this.database = database;
  }

  async register(userData) {
    if (!userData.email || !userData.password) {
      throw new Error('Email and password are required');
    }
    const existingUser = await this.database.findUserByEmail(userData.email);
    if (existingUser) {
      throw new Error('User already exists');
    }
    return await this.database.saveUser(userData);
  }

  async login(email, password) {
    if (!email || !password) {
      throw new Error('Email and password are required');
    }
    const user = await this.database.findUserByEmail(email);
    if (!user || user.password !== password) {
      throw new Error('Invalid email or password');
    }
    return user;
  }
}

module.exports = UserRegistrationLogin;




Here's how you can write your tests using Jest:


// __tests__/user_registration_login.test.js
const UserRegistrationLogin = require('../src/user_registration_login');

describe('UserRegistrationLogin', () => {
  let userRegistrationLogin;
  let mockDatabase;

  beforeEach(() => {
    mockDatabase = {
      findUserByEmail: jest.fn(),
      saveUser: jest.fn(),
    };
    userRegistrationLogin = new UserRegistrationLogin(mockDatabase);
  });

  describe('register', () => {
    it('should successfully register a new user', async () => {
      const userData = { email: 'test@example.com', password: 'password123' };
      mockDatabase.findUserByEmail.mockResolvedValue(null); // User does not exist
      mockDatabase.saveUser.mockResolvedValue(userData); // Simulate saving user

      const result = await userRegistrationLogin.register(userData);
      expect(result).toEqual(userData);
      expect(mockDatabase.findUserByEmail).toHaveBeenCalledWith(userData.email);
      expect(mockDatabase.saveUser).toHaveBeenCalledWith(userData);
    });

    it('should throw an error if email and password are not provided', async () => {
      await expect(userRegistrationLogin.register({})).rejects.toThrow('Email and password are required');
    });

    it('should throw an error if the user already exists', async () => {
      const userData = { email: 'test@example.com', password: 'password123' };
      mockDatabase.findUserByEmail.mockResolvedValue(userData); // User exists

      await expect(userRegistrationLogin.register(userData)).rejects.toThrow('User already exists');
    });
  });

  describe('login', () => {
    it('should login successfully with valid credentials', async () => {
      const email = 'test@example.com';
      const password = 'password123';
      const user = { email, password };
      mockDatabase.findUserByEmail.mockResolvedValue(user); // User exists

      const result = await userRegistrationLogin.login(email, password);
      expect(result).toEqual(user);
      expect(mockDatabase.findUserByEmail).toHaveBeenCalledWith(email);
    });

    it('should throw an error if email or password are not provided', async () => {
      await expect(userRegistrationLogin.login('', 'password123')).rejects.toThrow('Email and password are required');
      await expect(userRegistrationLogin.login('test@example.com', '')).rejects.toThrow('Email and password are required');
    });

    it('should throw an error if credentials are invalid', async () => {
      const email = 'test@example.com';
      const password = 'wrongpassword';
      mockDatabase.findUserByEmail.mockResolvedValue({ email, password: 'password123' }); // User exists, but password is wrong

      await expect(userRegistrationLogin.login(email, password)).rejects.toThrow('Invalid email or password');
    });
  });
});



1. **Happy Paths**: It includes tests that simulate a successful user registration and login scenario.
2. **Error Cases**: Various error scenarios such as missing email/password, user already existing, and invalid login credentials are tested.
3. **Mocks**: The `mockDatabase` simulates the database functionality, allowing us to control the responses and verify interactions.


Ensure you have Jest installed in your project. To run the tests, you can use:
bash
npm test

or
bash
jest


This will give you 100% coverage for the provided JavaScript code.