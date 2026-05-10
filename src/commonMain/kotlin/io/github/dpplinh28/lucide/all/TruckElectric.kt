package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TruckElectric") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 19f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 19f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 19f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3.65f)
                arcToRelative(1f, 1f, 0f, false, false, -.22f, -.62f)
                lineTo(18.3f, 9.38f)
                arcToRelative(1f, 1f, 0f, false, false, -.78f, -.38f)
                horizontalLineTo(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 3f)
                lineTo(2.15f, 5.15f)
                arcToRelative(.495f, .495f, 0f, false, false, .35f, .86f)
                horizontalLineToRelative(2.15f)
                arcToRelative(.47f, .47f, 0f, false, true, .35f, .86f)
                lineTo(3f, 9.02f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.TruckElectricDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TruckElectric: ImageVector
    @Composable get() = TruckElectricDefinition.asImageVector()
