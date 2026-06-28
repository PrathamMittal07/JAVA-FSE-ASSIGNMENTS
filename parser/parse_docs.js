const xlsx = require('xlsx');
const mammoth = require('mammoth');
const fs = require('fs');
const path = require('path');

const excelPath = path.join(__dirname, '..', 'Digital-Nurture-JavaFSE', 'Java FSE', 'Deepskilling', 'DN - Java FSE Mandatory hands-on detail.xlsx');
const docxPath = path.join(__dirname, '..', 'Digital-Nurture-JavaFSE', 'Java FSE', 'Deepskilling', 'Engineering concepts', 'Design Patterns and Principles.docx');

// Read Excel
try {
    const workbook = xlsx.readFile(excelPath);
    const sheetName = workbook.SheetNames[0];
    const sheet = workbook.Sheets[sheetName];
    const data = xlsx.utils.sheet_to_json(sheet);
    console.log("=== EXCEL DATA ===");
    console.log(JSON.stringify(data.slice(0, 10), null, 2)); // Print first 10 rows
} catch (e) {
    console.error("Error reading Excel:", e);
}

// Read Docx
try {
    mammoth.extractText({path: docxPath})
        .then(function(result){
            var text = result.value; 
            console.log("=== DOCX TEXT (First 2000 chars) ===");
            console.log(text.substring(0, 2000));
        })
        .catch(function(err){
            console.error("Error reading Docx:", err);
        });
} catch (e) {
    console.error("Error with mammoth:", e);
}
