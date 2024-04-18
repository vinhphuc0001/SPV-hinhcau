package N20DCVT038_OOP_TH4_04;

class HinhCau implements HinhHocCoBan, HinhHoc3D {
    private double banKinh;

    // Constructor
    public HinhCau(double banKinh) {
        this.banKinh = banKinh;
    }

    // Implementation of tinhDienTich method
    @Override
    public double tinhDienTich() {
        return 4 * Math.PI * Math.pow(banKinh, 2);
    }

    // Implementation of tinhChuVi method
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Implementation of tinhTheTich method
    @Override
    public double tinhTheTich() {
        return (4.0/3) * Math.PI * Math.pow(banKinh, 3);
    }
}
