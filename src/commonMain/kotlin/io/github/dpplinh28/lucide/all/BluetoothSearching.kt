package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothSearching") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 7f)
                lineToRelative(10f, 10f)
                lineToRelative(-5f, 5f)
                verticalLineTo(2f)
                lineToRelative(5f, 5f)
                lineTo(7f, 17f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.83f, 14.83f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -5.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.BluetoothSearchingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothSearching: ImageVector
    @Composable get() = BluetoothSearchingDefinition.asImageVector()
