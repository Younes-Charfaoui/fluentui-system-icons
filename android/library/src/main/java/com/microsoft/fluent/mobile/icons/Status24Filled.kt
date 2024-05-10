package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Status24: ImageVector
  get() {
    if (_status24 != null) {
      return _status24!!
    }
    _status24 = fluentIcon(name = "Filled.Status24", 24f) {
      materialPath {
          moveTo(16.025F, 3.025F)
          curveToRelative(1.367F, -1.367F, 3.583F, -1.367F, 4.95F, 0.0F)
          reflectiveCurveToRelative(1.367F, 3.583F, 0.0F, 4.95F)
          lineToRelative(-6.06F, 6.06F)
          curveToRelative(-0.346F, 0.346F, -0.78F, 0.594F, -1.254F, 0.717F)
          lineToRelative(-4.723F, 1.224F)
          curveToRelative(-0.257F, 0.067F, -0.53F, -0.008F, -0.718F, -0.196F)
          curveToRelative(-0.188F, -0.188F, -0.263F, -0.46F, -0.196F, -0.718F)
          lineToRelative(1.224F, -4.723F)
          curveToRelative(0.123F, -0.475F, 0.37F, -0.908F, 0.718F, -1.255F)
          lineToRelative(6.06F, -6.059F)
          close()
          moveToRelative(-1.694F, 0.28F)
          curveTo(13.588F, 3.106F, 12.806F, 3.0F, 12.0F, 3.0F)
          curveToRelative(-4.97F, 0.0F, -9.0F, 4.03F, -9.0F, 9.0F)
          reflectiveCurveToRelative(4.03F, 9.0F, 9.0F, 9.0F)
          reflectiveCurveToRelative(9.0F, -4.03F, 9.0F, -9.0F)
          curveToRelative(0.0F, -0.806F, -0.106F, -1.588F, -0.305F, -2.331F)
          lineToRelative(-1.27F, 1.27F)
          curveToRelative(0.05F, 0.346F, 0.075F, 0.7F, 0.075F, 1.061F)
          curveToRelative(0.0F, 4.142F, -3.358F, 7.5F, -7.5F, 7.5F)
          curveToRelative(-4.142F, 0.0F, -7.5F, -3.358F, -7.5F, -7.5F)
          curveToRelative(0.0F, -4.142F, 3.358F, -7.5F, 7.5F, -7.5F)
          curveToRelative(0.36F, 0.0F, 0.715F, 0.025F, 1.061F, 0.074F)
          lineToRelative(1.27F, -1.27F)
          close()        
      }
    }
    return _status24!!
  }

private var _status24: ImageVector? = null
