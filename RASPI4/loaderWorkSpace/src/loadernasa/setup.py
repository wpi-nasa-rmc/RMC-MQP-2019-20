from setuptools import setup

package_name = 'loadernasa'

setup(
    name=package_name,
    version='0.0.0',
    packages=[package_name],
    data_files=[
        ('share/ament_index/resource_index/packages',
            ['resource/' + package_name]),
        ('share/' + package_name, ['package.xml']),
    ],
    install_requires=['setuptools'],
    zip_safe=True,
    maintainer='nasarmc',
    maintainer_email='wpinasarmc@gmail.com',
    description='Loader package of nodes',
    license='TODO: License declaration',
    tests_require=['pytest'],
    entry_points={
        'console_scripts': [
            'talker = loadernasa.publisher_member_function:main',
            'listener = loadernasa.subscriber_member_function:main',
            'service = loadernasa.service_member_function:main',
            'client = loadernasa.client_member_function:main'
        ],
    },
)
