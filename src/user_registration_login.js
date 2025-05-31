// User Registration and Login Implementation

class UserAuth {
    constructor() {
        this.users = {};
    }

    register(username, password) {
        if(this.users[username]) {
            console.log('User already exists.');
            return false;
        }
        this.users[username] = password;
        console.log(`User ${username} registered successfully.`);
        return true;
    }

    login(username, password) {
        if(!this.users[username]) {
            console.log('User not found.');
            return false;
        }
        if(this.users[username] !== password) {
            console.log('Incorrect password.');
            return false;
        }
        console.log(`User ${username} logged in successfully.`);
        return true;
    }
}

// Example Usage
const userAuth = new UserAuth();
userAuth.register('johnDoe', 'password123');
userAuth.login('johnDoe', 'password123');
