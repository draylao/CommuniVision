package com.o4.CommuniVision.model.entity;

public class BridgeDataset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "bridgeDataset", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bridge> bridges;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

}
