package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Warehouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 21f)
                verticalLineTo(10f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 1.132f, -1.803f)
                lineToRelative(7.95f, -3.974f)
                arcToRelative(2f, 2f, 0f, false, true, 1.837f, 0f)
                lineToRelative(7.948f, 3.974f)
                arcTo(2f, 2f, 0f, false, true, 22f, 8f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 17f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.WarehouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Warehouse: ImageVector
    @Composable get() = WarehouseDefinition.asImageVector()
