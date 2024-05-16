let mahasiswa = {
    nama: "Rizal Evendi",
    npm: "230441100175",
    jurusan: "Sistem Informasi",
    nilai: [85, 90, 100, 95]
}

console.log("Data Mahasiswa:");
console.log("Nama: " + mahasiswa.nama);
console.log("NPM: " + mahasiswa.npm);
console.log("Jurusan: " + mahasiswa.jurusan);
console.log("Nilai: " + mahasiswa.nilai);


function nilairatarata(nilaiMahasiswa) {
    let total = 0;
    for (let nilai of nilaiMahasiswa) {
        total += nilai;
    }
    return total / nilaiMahasiswa.length;
}

let nilairatarataMahasiswa = nilairatarata(mahasiswa.nilai);
console.log("\nnilai rata-rata Mahasiswa: " + nilairatarataMahasiswa);





function membalikkan(string) {
    return string.split("").reverse().join("");
}
let membalikkannama = membalikkan(mahasiswa.nama);
console.log("\nNama Terbalik: " + membalikkannama);


function tampilkannilaidenganangka(nilaiMahasiswa) {
    console.log("\nNilai Mahasiswa:");
    for (let i = 0; i < nilaiMahasiswa.length; i++) {
        console.log("Nilai ke" + (i + 1) + ": " + nilaiMahasiswa[i]);
    }
}
tampilkannilaidenganangka(mahasiswa.nilai);


function tentukanNilaiHuruf(nilaiRataRata) {
    if (nilaiRataRata > 80) {
        return "A";
    } else if (nilaiRataRata >= 70 && nilaiRataRata <=79) {
        return "B";
    } else if (nilaiRataRata  >= 60 && nilaiRataRata <= 69) {
        return "C";
    } else if (nilaiRataRata  >= 50 && nilaiRataRata <= 59) {
        return "D";
    } else {
        return "E";
    }
}
console.log("\nNilai Rata-rata berdasarkan huruf: " + tentukanNilaiHuruf(nilairatarataMahasiswa));



