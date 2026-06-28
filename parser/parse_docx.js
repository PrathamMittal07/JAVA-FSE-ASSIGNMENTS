const mammoth = require('mammoth');
const path = require('path');

const docxPath = path.join(__dirname, '..', 'Digital-Nurture-JavaFSE', 'Java FSE', 'Deepskilling', 'Engineering concepts', 'Design Patterns and Principles.docx');

// Read Docx
try {
    mammoth.extractRawText({path: docxPath})
        .then(function(result){
            var text = result.value; 
            console.log(text.substring(0, 3000));
        })
        .catch(function(err){
            console.error("Error reading Docx:", err);
        });
} catch (e) {
    console.error("Error with mammoth:", e);
}
