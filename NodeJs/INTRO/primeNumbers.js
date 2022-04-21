const arguments = process.argv.slice(2);

function showPrimeNumber(lowNumber, highNumber) {
  for (let i = lowNumber; i <= highNumber; i++) {
    let isPrime = true;
    for (let j = 2; j <= highNumber; j++) {
      if (i % j === 0 && j !== i) {
        isPrime = false;
      }
    }
    if (isPrime) {
      console.log(i);
    }
  }
}

showPrimeNumber(arguments[0] * 1, arguments[1] * 1);

//console.log();