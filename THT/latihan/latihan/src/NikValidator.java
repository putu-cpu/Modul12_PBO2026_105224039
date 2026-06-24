public class NikValidator implements PassengerValidator {
    //S
    @Override
    public void validate(String nik) {
        if (nik.length() != 16 || !nik.matches("\\d+")) {
            throw new DataPenumpangTidakValidException("NIK harus terdiri dari 16 digit angka!");
        }
    }
}