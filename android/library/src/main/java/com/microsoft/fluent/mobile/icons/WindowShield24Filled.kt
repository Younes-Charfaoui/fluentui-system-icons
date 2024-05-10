package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.WindowShield24: ImageVector
  get() {
    if (_windowShield24 != null) {
      return _windowShield24!!
    }
    _windowShield24 = fluentIcon(name = "Filled.WindowShield24", 24f) {
      materialPath {
          moveTo(3.0F, 6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(11.5F)
          curveTo(19.545F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(5.726F)
          curveToRelative(-0.567F, -0.178F, -1.08F, -0.48F, -1.5F, -0.79F)
          verticalLineTo(8.5F)
          horizontalLineToRelative(-15.0F)
          verticalLineToRelative(9.25F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineToRelative(6.482F)
          curveToRelative(0.29F, 0.54F, 0.666F, 1.042F, 1.122F, 1.5F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(6.25F)
          close()
          moveToRelative(14.99F, 4.944F)
          curveToRelative(0.652F, 0.651F, 1.907F, 1.686F, 3.449F, 1.899F)
          curveTo(21.747F, 13.135F, 22.0F, 13.378F, 22.0F, 13.682F)
          verticalLineToRelative(2.838F)
          curveToRelative(0.0F, 3.816F, -3.58F, 5.201F, -4.353F, 5.456F)
          curveToRelative(-0.097F, 0.032F, -0.196F, 0.032F, -0.293F, 0.0F)
          curveTo(16.58F, 21.721F, 13.0F, 20.336F, 13.0F, 16.52F)
          verticalLineToRelative(-2.838F)
          curveToRelative(0.0F, -0.304F, 0.253F, -0.547F, 0.561F, -0.59F)
          curveToRelative(1.542F, -0.212F, 2.797F, -1.247F, 3.45F, -1.898F)
          curveToRelative(0.26F, -0.259F, 0.719F, -0.259F, 0.979F, 0.0F)
          close()        
      }
    }
    return _windowShield24!!
  }

private var _windowShield24: ImageVector? = null
