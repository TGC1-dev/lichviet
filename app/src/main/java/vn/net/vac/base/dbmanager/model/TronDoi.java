package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "tid", name = "TronDoi")
public class TronDoi extends Model implements Serializable {
    @Column(name = "tid")
    public long a;
    @Column(name = "tname")
    public String b;
    @Column(name = "tnam")
    public String c;
    @Column(name = "tnu")
    public String d;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
