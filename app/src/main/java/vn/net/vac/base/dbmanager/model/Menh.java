package vn.net.vac.base.dbmanager.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.io.Serializable;

@Table(id = "mid", name = "Menh")
public class Menh extends Model implements Serializable {
    @Column(name = "mid")
    public long a;
    @Column(name = "menh")
    public String b;
    @Column(name = "cung")
    public String c;
}
