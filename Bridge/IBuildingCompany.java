package Bridge;

public abstract class IBuildingCompany {
    protected IWallCreator iWallCreator;

    protected IBuildingCompany(IWallCreator iWallCreator) {
        this.iWallCreator = iWallCreator;
    }

    public abstract void BuildFoundation(IWallCreator iWallCreator);
    // void BuildRoo();
    // void BuildRoof();
}

class BuldingCompany extends IBuildingCompany {
    public BuldingCompany(IWallCreator iWallCreator) {
        super(iWallCreator);
    }

    @Override
    public void BuildFoundation(IWallCreator iWallCreator) {
        System.out.println("BuldingCompany by" + iWallCreator.toString());
    }
}

class NearSeaBuldingCompany extends IBuildingCompany {
    public NearSeaBuldingCompany(IWallCreator iWallCreator) {
        super(iWallCreator);
    }

    @Override
    public void BuildFoundation(IWallCreator iWallCreator) {
        System.out.println("NearSeaBuldinCompany by" + iWallCreator.toString());
    }

}
