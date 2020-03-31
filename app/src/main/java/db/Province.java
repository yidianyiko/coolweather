package db;

import org.litepal.exceptions.DataSupportException;

public class Province extends DataSupportException {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public Province(String errorMessage) {
        super(errorMessage);
    }
}
