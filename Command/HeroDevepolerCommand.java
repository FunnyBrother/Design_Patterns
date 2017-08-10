package Command;
class HeroDevepolerCommand implements ICommand {
    protected HeroDeveloper heroDeveloper;
    protected String projectName;

    public HeroDevepolerCommand(HeroDeveloper heroDeveloper, String projectName) {
        this.heroDeveloper = heroDeveloper;
        this.projectName = projectName;
    }

    @Override
    public void Execute() {
        heroDeveloper.DoAllHardWork(projectName);
    }

}
