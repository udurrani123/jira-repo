const add = require('./sampleFunction');

describe('add function', () => {
    test('should return the sum of two positive numbers', () => {
        // Arrange
        const a = 5;
        const b = 10;

        // Act
        const result = add(a, b);

        // Assert
        expect(result).toBe(15);
    });

    test('should return the sum of a positive and a negative number', () => {
        // Arrange
        const a = 5;
        const b = -10;

        // Act
        const result = add(a, b);

        // Assert
        expect(result).toBe(-5);
    });

    test('should return the sum of two negative numbers', () => {
        // Arrange
        const a = -5;
        const b = -10;

        // Act
        const result = add(a, b);

        // Assert
        expect(result).toBe(-15);
    });
});