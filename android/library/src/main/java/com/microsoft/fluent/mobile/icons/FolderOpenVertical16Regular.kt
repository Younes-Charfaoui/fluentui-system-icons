package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.FolderOpenVertical16: ImageVector
  get() {
    if (_folderOpenVertical16 != null) {
      return _folderOpenVertical16!!
    }
    _folderOpenVertical16 = fluentIcon(name = "Regular.FolderOpenVertical16", 16f) {
      materialPath {
          moveTo(11.5F, 2.0F)
          horizontalLineTo(6.9F)
          lineToRelative(1.6F, 0.924F)
          curveTo(9.428F, 3.46F, 10.0F, 4.45F, 10.0F, 5.522F)
          verticalLineToRelative(6.393F)
          curveToRelative(0.583F, -0.206F, 1.0F, -0.762F, 1.0F, -1.415F)
          verticalLineTo(7.0F)
          curveToRelative(0.0F, -0.133F, 0.053F, -0.26F, 0.146F, -0.354F)
          lineToRelative(1.708F, -1.707F)
          curveTo(12.947F, 4.846F, 13.0F, 4.72F, 13.0F, 4.586F)
          verticalLineTo(3.5F)
          curveTo(13.0F, 2.672F, 12.328F, 2.0F, 11.5F, 2.0F)
          close()
          moveTo(2.005F, 7.069F)
          curveTo(2.002F, 7.046F, 2.0F, 7.023F, 2.0F, 7.0F)
          verticalLineTo(3.5F)
          curveTo(2.0F, 2.12F, 3.12F, 1.0F, 4.5F, 1.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 1.0F, 14.0F, 2.12F, 14.0F, 3.5F)
          verticalLineToRelative(1.086F)
          curveToRelative(0.0F, 0.398F, -0.158F, 0.78F, -0.44F, 1.06F)
          lineTo(12.0F, 7.207F)
          verticalLineTo(10.5F)
          curveToRelative(0.0F, 1.224F, -0.88F, 2.243F, -2.041F, 2.458F)
          curveToRelative(-0.3F, 1.647F, -2.18F, 2.586F, -3.709F, 1.704F)
          lineToRelative(-2.745F, -1.585F)
          curveToRelative(-0.929F, -0.536F, -1.5F, -1.527F, -1.5F, -2.598F)
          verticalLineToRelative(-3.41F)
          close()
          moveTo(9.0F, 5.522F)
          curveTo(9.0F, 4.807F, 8.619F, 4.147F, 8.0F, 3.79F)
          lineTo(5.255F, 2.205F)
          curveToRelative(-1.0F, -0.577F, -2.25F, 0.144F, -2.25F, 1.299F)
          verticalLineToRelative(6.975F)
          curveToRelative(0.0F, 0.714F, 0.38F, 1.374F, 1.0F, 1.732F)
          lineToRelative(2.745F, 1.585F)
          curveToRelative(1.0F, 0.577F, 2.25F, -0.145F, 2.25F, -1.3F)
          verticalLineTo(5.522F)
          close()        
      }
    }
    return _folderOpenVertical16!!
  }

private var _folderOpenVertical16: ImageVector? = null
