package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWallFire") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                verticalLineToRelative(2.107f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 9f)
                curveToRelative(1f, 3f, 2.5f, 3.5f, 3.5f, 4.5f)
                arcTo(5f, 5f, 0f, false, true, 22f, 17f)
                arcToRelative(5f, 5f, 0f, false, true, -10f, 0f)
                curveToRelative(0f, -.3f, 0f, -.6f, .1f, -.9f)
                arcToRelative(2f, 2f, 0f, true, false, 3.3f, -2f)
                curveTo(13f, 11.5f, 16f, 9f, 17f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8.274f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3.938f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 15f)
                horizontalLineToRelative(5.253f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(8.228f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.BrickWallFireDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWallFire: ImageVector
    @Composable get() = BrickWallFireDefinition.asImageVector()
