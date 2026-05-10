package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BugOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.656f, 7f)
                horizontalLineTo(14f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(1.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f, 3.88f)
                lineTo(16f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.123f, 17.123f)
                arcTo(6f, 6f, 0f, false, true, 6f, 14f)
                verticalLineToRelative(-3f)
                arcToRelative(4f, 4f, 0f, false, true, 1.72f, -3.287f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                arcToRelative(4f, 4f, 0f, false, true, -3.55f, 3.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 13f)
                horizontalLineToRelative(-3.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 21f)
                arcToRelative(4f, 4f, 0f, false, true, 3.81f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                arcToRelative(4f, 4f, 0f, false, false, 3.55f, 3.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 2f)
                lineToRelative(1.88f, 1.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.712f, 4.06f)
                arcTo(3f, 3f, 0f, false, true, 15f, 6f)
                verticalLineToRelative(1.13f)
            }
}

public val LucideIcons.All.BugOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BugOff: ImageVector
    @Composable get() = BugOffDefinition.asImageVector()
