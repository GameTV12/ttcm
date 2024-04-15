const fs = require('fs')
const readline = require('readline')

const isNumber = (n) => { return !isNaN(parseFloat(n)) && !isNaN(n - 0) }

const processNumbers = (numbers) => {
    if (numbers.length % 2 === 0) return numbers.filter(num => num % 2 === 0)
    return numbers.filter(num => num % 2 === 1)
};

const outputResult = (result, outputFile = null) => {
    if (outputFile) {
        if (outputFile.slice(-4) !== ".txt") {
            outputFile += '.txt'
        }
        fs.writeFileSync(outputFile, result.join(' ') + '\n')
    }
    else console.log(result.join(' '))
}

const readFromStdin = (outputFile = null) => {
    const readNumbers = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    })

    readNumbers.question('Enter each number: ', numbersString => {
        const numbers = numbersString.trim().split(' ').map(Number)
        const result = processNumbers(numbers)

        outputResult(result, outputFile)

        readNumbers.question("Click Enter for finishing... ", () => {
            readNumbers.close()
        })
    })
}

const readFromFile = (inputFile, outputFile = null) => {
    const content = fs.readFileSync(inputFile, 'utf8')

    const numbers = content.split(/\s+/).map(Number)
    const result = processNumbers(numbers)

    outputResult(result, outputFile)
}

const main = () => {
    const readArgs = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    })

    readArgs.question('Enter args: ', arguments => {
        const inputArgs = arguments.trim().split(' ').map(String);
        const [input, output] = [inputArgs[0], inputArgs[1]]

        readArgs.close()

        if (input == null || isNumber(input)) readFromStdin(output)
        else readFromFile(input, output)
    })
}

main()