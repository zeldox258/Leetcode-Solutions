/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let x=init;
    return{

     increment: function(){
        return ++init;
        },
        reset: function(){
            init =x;
            return x;
        },
        decrement: function(){
            return --init;
        },
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */