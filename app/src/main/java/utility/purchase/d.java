package vn.net.vac.base.utility.purchase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Inventory */
public class d {
    Map<String, g> a = new HashMap();
    Map<String, e> b = new HashMap();

    d() {
    }

    /* Access modifiers changed, original: 0000 */
    public List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar.b().equals(str)) {
                arrayList.add(eVar.c());
            }
        }
        return arrayList;
    }

    public e b(String str) {
        return (e) this.b.get(str);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(g gVar) {
        this.a.put(gVar.a(), gVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(e eVar) {
        this.b.put(eVar.c(), eVar);
    }
}
