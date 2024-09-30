const fs = require('fs');

try {
    const flag = fs.readFileSync('flag.txt', 'utf8');
    console.log(`Flag: ${flag}`);
} catch (err) {
    console.error('Erro ao ler o arquivo flag.txt:', err);
}
