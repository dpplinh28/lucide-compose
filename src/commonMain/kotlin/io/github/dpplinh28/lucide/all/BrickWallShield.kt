package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWallShield") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 9f)
                verticalLineToRelative(1.258f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                verticalLineToRelative(5.46f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9.118f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(5.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 17.5f)
                curveToRelative(0f, 2.499f, -1.75f, 3.749f, -3.83f, 4.474f)
                arcToRelative(.5f, .5f, 0f, false, true, -.335f, -.005f)
                curveToRelative(-2.085f, -.72f, -3.835f, -1.97f, -3.835f, -4.47f)
                verticalLineTo(14f)
                arcToRelative(.5f, .5f, 0f, false, true, .5f, -.499f)
                curveToRelative(1f, 0f, 2.25f, -.6f, 3.12f, -1.36f)
                arcToRelative(.6f, .6f, 0f, false, true, .76f, -.001f)
                curveToRelative(.875f, .765f, 2.12f, 1.36f, 3.12f, 1.36f)
                arcToRelative(.5f, .5f, 0f, false, true, .5f, .5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 15f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(12.142f)
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

public val LucideIcons.All.BrickWallShieldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWallShield: ImageVector
    @Composable get() = BrickWallShieldDefinition.asImageVector()
