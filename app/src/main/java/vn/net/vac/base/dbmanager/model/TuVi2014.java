package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "tid", name = "TuVi2021")
public class TuVi2014 extends Model implements Serializable {
    @Column(name = "tid")
    public long a;
    @Column(name = "tname")
    public String b;
    @Column(name = "tcontent")
    public String c;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
