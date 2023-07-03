package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Voicemail48: ImageVector
  get() {
    if (_voicemail48 != null) {
      return _voicemail48!!
    }
    _voicemail48 = fluentIcon(name = "Filled.Voicemail48", 48f) {
      materialPath {
          moveTo(19.5F, 24.0F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          reflectiveCurveToRelative(-3.5F, -1.567F, -3.5F, -3.5F)
          reflectiveCurveToRelative(1.567F, -3.5F, 3.5F, -3.5F)
          reflectiveCurveToRelative(3.5F, 1.567F, 3.5F, 3.5F)
          close()
          moveTo(32.0F, 20.5F)
          curveToRelative(-1.933F, 0.0F, -3.5F, 1.567F, -3.5F, 3.5F)
          reflectiveCurveToRelative(1.567F, 3.5F, 3.5F, 3.5F)
          reflectiveCurveToRelative(3.5F, -1.567F, 3.5F, -3.5F)
          reflectiveCurveToRelative(-1.567F, -3.5F, -3.5F, -3.5F)
          close()
          moveTo(8.25F, 8.0F)
          curveTo(5.903F, 8.0F, 4.0F, 9.903F, 4.0F, 12.25F)
          verticalLineToRelative(23.5F)
          curveTo(4.0F, 38.097F, 5.903F, 40.0F, 8.25F, 40.0F)
          horizontalLineToRelative(31.5F)
          curveToRelative(2.347F, 0.0F, 4.25F, -1.903F, 4.25F, -4.25F)
          verticalLineToRelative(-23.5F)
          curveTo(44.0F, 9.903F, 42.097F, 8.0F, 39.75F, 8.0F)
          horizontalLineTo(8.25F)
          close()
          moveToRelative(12.624F, 12.5F)
          curveTo(21.583F, 21.485F, 22.0F, 22.694F, 22.0F, 24.0F)
          curveToRelative(0.0F, 3.314F, -2.686F, 6.0F, -6.0F, 6.0F)
          reflectiveCurveToRelative(-6.0F, -2.686F, -6.0F, -6.0F)
          reflectiveCurveToRelative(2.686F, -6.0F, 6.0F, -6.0F)
          horizontalLineToRelative(16.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, 2.686F, 6.0F, 6.0F)
          reflectiveCurveToRelative(-2.686F, 6.0F, -6.0F, 6.0F)
          reflectiveCurveToRelative(-6.0F, -2.686F, -6.0F, -6.0F)
          curveToRelative(0.0F, -1.306F, 0.417F, -2.515F, 1.126F, -3.5F)
          horizontalLineToRelative(-6.252F)
          close()        
      }
    }
    return _voicemail48!!
  }

private var _voicemail48: ImageVector? = null
