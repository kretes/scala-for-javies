# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

  config.vm.box = "precise64"
  config.vm.box_url = "http://files.vagrantup.com/precise64.box"

  #config.vm.box = "raringchef114"
  #config.vm.box_url = "http://goo.gl/Y4aRr"

  config.vm.provider "virtualbox" do |v|
    v.gui = true
  end

  config.omnibus.chef_version = "11.10.4"
  # install by `vagrant plugin install vagrant-omnibus`

  config.vm.provision :chef_solo do |chef|
    chef.cookbooks_path = ["cookbooks"]
    chef.add_recipe :apt
    chef.add_recipe 'vim'
    chef.add_recipe 'git'
    chef.add_recipe 'tar'
    chef.add_recipe 'scala-ide'
    chef.json = {
      :git => {
        :prefix => "/usr/local"
      }
    }
  end
end
