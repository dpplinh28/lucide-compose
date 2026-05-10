package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bluetooth") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 7f)
                lineToRelative(10f, 10f)
                lineToRelative(-5f, 5f)
                verticalLineTo(2f)
                lineToRelative(5f, 5f)
                lineTo(7f, 17f)
            }
}

public val LucideIcons.All.BluetoothDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bluetooth: ImageVector
    @Composable get() = BluetoothDefinition.asImageVector()
