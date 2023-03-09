package Bai1;

public class HoaQua {
        public String nguongoc;
        public double giaban;
        public long soluong;
        public int ngaynhap;
        public String mausac;
        
        public HoaQua(String nguongoc, double giaban, long soluong, int ngaynhap, String mausac) {
            this.nguongoc = nguongoc;
            this.giaban = giaban;
            this.soluong = soluong;
            this.ngaynhap = ngaynhap;
            this.mausac = mausac;
        }
    
        public String getNguongoc() {
            return nguongoc;
        }
    
        public void setNguongoc(String nguongoc) {
            this.nguongoc = nguongoc;
        }
    
        public double getGiaban() {
            return giaban;
        }
    
        public void setGiaban(int giaban) {
            this.giaban = giaban;
        }
    
        public long getSoluong() {
            return soluong;
        }
    
        public void setSoluong(long soluong) {
            this.soluong = soluong;
        }
    
        public int getNgaynhap() {
            return ngaynhap;
        }
    
        public void setNgaynhap(int ngaynhap) {
            this.ngaynhap = ngaynhap;
        }
    
        public String getMausac() {
            return mausac;
        }
    
        public void setMausac(String mausac) {
            this.mausac = mausac;
        }
        
    }
    

