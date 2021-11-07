package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "id", name = "ThuocLoBan")
public class ThuocLoBan extends Model implements Serializable {
    @Column(name = "name")
    public String a;
    @Column(name = "description")
    public String b;
}
