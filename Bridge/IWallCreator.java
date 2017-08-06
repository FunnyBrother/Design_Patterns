package Bridge;
public interface IWallCreator {
    public IWallCreator CreateWall(IWallCreator iWallCreator);
}

class BrickWallCreator implements IWallCreator {
    @Override
    public String toString() {
        return "BrickWallCreator";
    }

    @Override
    public IWallCreator CreateWall(IWallCreator iWallCreator) {
        return this;
    }
}

class ConcreteSlaWallCreator implements IWallCreator {
    @Override
    public String toString() {
        return "ConcreteSlaWallCreator";
    }

    @Override
    public IWallCreator CreateWall(IWallCreator iWallCreator) {
        return this;
    }
}
