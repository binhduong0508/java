package Hinhhocs;

public class texthinh {
    public static void main(String[] args) {
        Hinhtron htr=new Hinhtron();
        htr.Inten();
        htr.nhapbankinh();
        htr.tinhchuvi();
        htr.tinhdientich();
        htr.inchuvi();
        htr.indientich();

        Hinhtru htru = new Hinhtru();
        htru.Inten();
        htru.nhapchieucao();
        htru.tinhchuvi();
        htru.tinhdientich();
        htru.tinhthetich();
        htru.inchuvi();
        htru.indientich();
        htru.inthetich();

        Hinhchunhat hcn = new Hinhchunhat();
        hcn.Inten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();

        Hinhvuong hv = new Hinhvuong();
        hv.Inten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();

    }
}
