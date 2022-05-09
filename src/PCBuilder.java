public class PCBuilder {
    PC pc = new PC();

    public PCBuilder addProcessor(String processor) {
        this.pc.setProcessor(processor);
        return this;
    }

    public PCBuilder addGraphic(String graphic) {
        this.pc.setGraphic(graphic);
        return this;
    }

    public PCBuilder addDisk(String disk) {
        this.pc.setDisk(disk);
        return this;
    }

    public PCBuilder addMotherboard(String motherboard) {
        this.pc.setMotherboard(motherboard);
        return this;
    }

    public PC build() {
        return this.pc;
    }
}
