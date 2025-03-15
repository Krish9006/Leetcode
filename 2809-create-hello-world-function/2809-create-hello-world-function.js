/**
 * @return {Function}
 */
var createHelloWorld = function() {
    console.log("hello world");
    return function(...args) {
        return "Hello World";    
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */