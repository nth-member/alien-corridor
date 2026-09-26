import json,collections,sys
for t in ('primary','bank'):
    r=json.load(open(f'tools/reference/cmp_{t}.json'))['modules']
    T=collections.Counter()
    for m in r.values():
        T['modules']+=1; T['load ok']+=m['load']=='ok'
        T['out identical']+=m['outExact']
        T['out same values (number print)']+= (not m['outExact']) and m['outValue']
        T['out same up to clock']+= (not m['outValue']) and m['outClock']
        T['out differs']+= not m['outClock']
        for k in ('agentsExact','agentsClock','inv','invExact','invClock','invBothFail'): T[k]+=m[k]
        T['agentsDiff']+=len(m['agentsDiff']); T['invDiff']+=len(m['invDiff'])
    print(t, dict(T))
    for ns,m in r.items():
        if m['load']!='ok': print('   LOAD FAIL',ns.split('.')[-1],m['load'][:150])
        if m['load']=='ok' and not m['outClock']: print('   OUT',ns.split('.')[-1],m.get('firstOutDiff'))
        for d in m['invDiff'][:2]: print('   INV',ns.split('.')[-1][:30],d['fn'][:40],'|',d['jvm'][:110],'|',d['sci'][:110])
        for d in m['agentsDiff'][:2]: print('   AGT',ns.split('.')[-1][:30],d)
