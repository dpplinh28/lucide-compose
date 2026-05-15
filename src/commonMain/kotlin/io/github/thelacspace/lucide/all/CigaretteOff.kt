package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CigaretteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                curveToRelative(0f, -2.5f, -2f, -2.5f, -2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -.5f, .866f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 8f)
                curveToRelative(0f, -2.5f, -2f, -2.5f, -2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.CigaretteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CigaretteOff: ImageVector
    @Composable get() = CigaretteOffDefinition.asImageVector()
