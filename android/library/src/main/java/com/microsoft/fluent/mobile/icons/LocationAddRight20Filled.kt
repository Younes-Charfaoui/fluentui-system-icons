package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LocationAddRight20: ImageVector
  get() {
    if (_locationAddRight20 != null) {
      return _locationAddRight20!!
    }
    _locationAddRight20 = fluentIcon(name = "Filled.LocationAddRight20", 20f) {
      materialPath {
          moveTo(14.95F, 13.955F)
          curveToRelative(2.733F, -2.735F, 2.733F, -7.169F, 0.0F, -9.904F)
          curveToRelative(-2.734F, -2.735F, -7.166F, -2.735F, -9.9F, 0.0F)
          curveToRelative(-2.733F, 2.735F, -2.733F, 7.17F, 0.0F, 9.904F)
          lineToRelative(1.521F, 1.499F)
          lineToRelative(2.043F, 1.985F)
          lineToRelative(0.133F, 0.118F)
          curveToRelative(0.775F, 0.628F, 1.91F, 0.588F, 2.64F, -0.118F)
          lineToRelative(2.435F, -2.37F)
          lineToRelative(1.128F, -1.114F)
          close()
          moveToRelative(-4.804F, -7.601F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(2.5F, 2.5F)
          curveTo(13.447F, 8.24F, 13.5F, 8.367F, 13.5F, 8.5F)
          curveToRelative(0.0F, 0.133F, -0.053F, 0.26F, -0.146F, 0.354F)
          lineToRelative(-2.5F, 2.5F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineTo(11.793F, 9.0F)
          horizontalLineTo(7.0F)
          curveTo(6.724F, 9.0F, 6.5F, 8.776F, 6.5F, 8.5F)
          reflectiveCurveTo(6.724F, 8.0F, 7.0F, 8.0F)
          horizontalLineToRelative(4.793F)
          lineToRelative(-1.647F, -1.646F)
          close()        
      }
    }
    return _locationAddRight20!!
  }

private var _locationAddRight20: ImageVector? = null
