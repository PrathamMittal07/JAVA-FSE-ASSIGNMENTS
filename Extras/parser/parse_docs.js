const xlsx = require('xlsx');
const path = require('path');

const excelPath = path.join(__dirname, '..', 'Digital-Nurture-JavaFSE', 'Java FSE', 'Deepskilling', 'DN - Java FSE Mandatory hands-on detail.xlsx');
try {
    const workbook = xlsx.readFile(excelPath);
    const sheetName = workbook.SheetNames[0];
    const sheet = workbook.Sheets[sheetName];
    const data = xlsx.utils.sheet_to_json(sheet);
    console.log(JSON.stringify(data, null, 2));
} catch (e) {
    console.error("Error reading excel:", e);
}
