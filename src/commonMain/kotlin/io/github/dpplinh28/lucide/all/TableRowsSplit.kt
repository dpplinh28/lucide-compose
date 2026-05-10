package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TableRowsSplit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 10f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 22f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 22f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 135f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 45f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 45f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 135f, false, false, 2f, -2f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 22f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.TableRowsSplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TableRowsSplit: ImageVector
    @Composable get() = TableRowsSplitDefinition.asImageVector()
