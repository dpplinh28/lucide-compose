package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShowerHead") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(4f, 4f)
                lineToRelative(2.5f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f, 6.5f)
                arcToRelative(4.95f, 4.95f, 0f, false, false, -7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 5f)
                lineTo(5f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 17f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 13f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 10f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 20f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 14f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 11f)
                verticalLineToRelative(.01f)
            }
}

public val LucideIcons.All.ShowerHeadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShowerHead: ImageVector
    @Composable get() = ShowerHeadDefinition.asImageVector()
